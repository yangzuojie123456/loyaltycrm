package org.loyalty.crm.controller;

import com.github.pagehelper.PageHelper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.loyalty.crm.domain.BasicCompany;
import org.loyalty.crm.domain.response.Response;
import org.loyalty.crm.service.BasicCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangzuojie on 2017/3/9.
 */
@RestController
@RequestMapping("/basic")
public class BasicCompanyController {
    @Autowired
    private BasicCompanyService basicCompanyService;

    @ApiOperation(value = "获取列表，支持分页", notes = "json方法获取列表")
    @ApiImplicitParams({ @ApiImplicitParam(name = "page", value = "当前页码", required = false, dataType = "int"),
            @ApiImplicitParam(name = "rows", value = "每页条数", required = false, dataType = "int") })
    @RequestMapping(value = "/api/company", method = RequestMethod.GET)
    public Response findAllCompany(Model model,
                                   @RequestParam(name = "page", defaultValue = "1") int page,
                                   @RequestParam(name = "rows", defaultValue = "10") int rows) {
        //存入page 和 rows 是为了redis缓存数据刷新
        Map<String,Object> maps = new HashMap<String, Object>();
        maps.put("page",page);
        maps.put("rows",rows);
        PageHelper.startPage(page, rows);
        List<BasicCompany> companyList = basicCompanyService.findAllCompany(maps);
        return new Response().success(companyList);
    }

    @RequestMapping(value = "/api/company/find",method = RequestMethod.GET)
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "当前数据id", required = false, dataType = "Long") })
    public Response findById(Model model,@RequestParam(value = "id", required = true) Long id){
        BasicCompany company = basicCompanyService.findById(id);
        return new Response().success(company);
    }
}
