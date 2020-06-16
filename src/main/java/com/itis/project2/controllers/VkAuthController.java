package com.itis.project2.controllers;

import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
//
//@Controller
//@RequestMapping("/vk")
//public class VkAuthController {
//    private String clientId = "7486342";
//    private String clientSecret = "bZ1HoSVMmk3O4PqijIcN";
//    private String redirectCallBackUri = "http://localhost:8080/vk";
//
//    @GetMapping()
//    public String getVkAuth(){
//        try {
//            TransportClient transportClient = HttpTransportClient.getInstance();
//            VkApiClient vk = new VkApiClient(transportClient);
//            UserAuthResponse authResponse = vk.oAuth()
//                    .userAuthorizationCodeFlow(clientId, clientId, redirectCallBackUri, code)
//                    .execute();
//
//            UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}