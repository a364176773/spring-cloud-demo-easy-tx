package icu.funkye.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 功能 服务类
 * </p>
 *
 * @author Funkye
 * @since 2019-04-10
 */
@FeignClient(value="demo-service")
@RequestMapping(value = "provider")
public interface ITestService {
    @RequestMapping(value = "/commit")
    Object commit();
    @RequestMapping(value = "/testCommit")
    void testCommit(@RequestParam(value = "xid") String xid);
}