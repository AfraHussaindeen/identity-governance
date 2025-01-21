/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.identity.user.endpoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

@ApiModel(description = "")
public class SuccessfulUserCreationDTO {

    @Valid 
    private String code = null;

    @Valid 
    private String message = null;

    @Valid 
    private String notificationChannel = null;

    @Valid 
    private String userId = null;

    /**
    * Status code of the operation.
    **/
    @ApiModelProperty(value = "Status code of the operation.")
    @JsonProperty("code")
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    /**
    * Descriptive message regarding the operation.
    **/
    @ApiModelProperty(value = "Descriptive message regarding the operation.")
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    /**
    * Account confirmation notification sent channel.
    **/
    @ApiModelProperty(value = "Account confirmation notification sent channel.")
    @JsonProperty("notificationChannel")
    public String getNotificationChannel() {
        return notificationChannel;
    }
    public void setNotificationChannel(String notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    /**
    * User Id.
    **/
    @ApiModelProperty(value = "User Id.")
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class SuccessfulUserCreationDTO {\n");
        
        sb.append("    code: ").append(code).append("\n");
        sb.append("    message: ").append(message).append("\n");
        sb.append("    notificationChannel: ").append(notificationChannel).append("\n");
        sb.append("    userId: ").append(userId).append("\n");
        
        sb.append("}\n");
        return sb.toString();
    }
}
