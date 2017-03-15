package org.loyalty.crm.controller;

import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.loyalty.crm.domain.BasicArticle;
import org.loyalty.crm.domain.response.Response;
import org.loyalty.crm.service.BasicArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/9.
 */
@RestController
@RequestMapping("/basic")
public class BasicArticleController {
    @Autowired
    private BasicArticleService basicArticleService;

    @ApiOperation(value = "获取列表，支持分页", notes = "json方法获取列表")
    @ApiImplicitParams({ @ApiImplicitParam(name = "page", value = "当前页码", required = false, dataType = "int"),
    @ApiImplicitParam(name = "rows", value = "每页条数", required = false, dataType = "int") })
    @RequestMapping(value = "/api/article", method = RequestMethod.GET)
    @RequiresPermissions("article:view")//权限管理;
    public Response findAllArticle(Model model,
   @RequestParam(name = "page", defaultValue = "1") int page,
   @RequestParam(name = "rows", defaultValue = "10") int rows) {
        Map<String,Object> maps = new HashMap<String, Object>();
        maps.put("page",page);
        maps.put("rows",rows);
        PageHelper.startPage(page, rows);
        List<BasicArticle> articleList = basicArticleService.findAllArticle(maps);
        return new Response().success(articleList);
    }

    @RequestMapping(value = "/api/article/find",method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "当前数据id", required = false, dataType = "Long") })
    @RequiresPermissions("article:findId")//权限管理;
    public Response findById(Model model,@RequestParam(value = "id", required = true) Long id){
        BasicArticle article = basicArticleService.findById(id);
        return new Response().success(article);
    }

    @RequestMapping(value="/api/article/add",method = RequestMethod.POST)
    public Response saveArticle(Model model,@Valid BasicArticle basicArticle,BindingResult bindingResult){
        //有错误信息
        model.addAttribute("basicArticle",basicArticle);
        if(bindingResult.hasErrors()){
            List<ObjectError>  list = bindingResult.getAllErrors();
            for(ObjectError  error:list){
                System.out.println(error.getCode()+"---"+error.getArguments()+"---"+error.getDefaultMessage());
                return new Response().failure(list);
            }
        }
        Long id = basicArticleService.saveArticle(basicArticle);
        return new Response().success(id);
    }

}
