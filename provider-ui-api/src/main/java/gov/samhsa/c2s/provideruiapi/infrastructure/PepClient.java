package gov.samhsa.c2s.provideruiapi.infrastructure;

import gov.samhsa.c2s.provideruiapi.infrastructure.dto.AccessRequestDto;
import gov.samhsa.c2s.provideruiapi.infrastructure.dto.AccessResponseDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@FeignClient("pep")
public interface PepClient {
    @RequestMapping(value = "/access", method = RequestMethod.POST)
    public AccessResponseDto access(@Valid @RequestBody AccessRequestDto accessRequest);


}
