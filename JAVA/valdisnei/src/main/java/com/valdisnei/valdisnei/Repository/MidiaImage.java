package com.valdisnei.valdisnei.Repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "midiaImage", url = "http://localhost:8081/midiaimgs")
public interface MidiaImage {

    @RequestMapping(method = RequestMethod.GET, value = "/{tipoMidia}/{id}")
    String mostrarUrlDe(@PathVariable int id, @PathVariable String tipoMidia);
    
}
