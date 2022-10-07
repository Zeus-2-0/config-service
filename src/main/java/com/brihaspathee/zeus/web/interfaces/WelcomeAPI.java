package com.brihaspathee.zeus.web.interfaces;

import com.brihaspathee.zeus.web.model.WelcomeDto;
import com.brihaspathee.zeus.web.response.ZeusApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 07, October 2022
 * Time: 7:10 AM
 * Project: Zeus
 * Package Name: com.brihaspathee.zeus.web.interfaces
 * To change this template use File | Settings | File and Code Template
 */
@RequestMapping("/api/v1/zeus")
@Validated
public interface WelcomeAPI {

    ResponseEntity<ZeusApiResponse<WelcomeDto>> getWelcomeMessage();
}
