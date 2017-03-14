package org.loyalty.crm.dao;

import org.loyalty.crm.domain.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yangzuojie on 2017/3/14.
 * 在这里你会发现我们只编写了UserInfo的数据库操作，那么我们怎么获取我们的权限信息了，
 * 通过userInfo.getRoleList()可以获取到对应的角色信息，然后在通过对应的角色可以获取到权限信息，当然这些都是JPA帮我们实现了，
 * 我们也可以进行直接获取到权限信息，只要写一个关联查询然后过滤掉重复的权限即可，这里不进行实现。
 */
public interface UserInfoMapper extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
