package com.leadtecture.feignsample.fooservice.feign;

import com.leadtecture.feignsample.barservice.BarContract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gaoweiwei 2018/8/23.
 */
@FeignClient(name = "bar-service", url = "http://localhost:8091")
public interface BarClient extends BarContract {

}
