/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.api.util;

/**
 * @author yh@firim
 */

public class PlatformURL {

    private String cmdUrl;

    private String queueUrl;

    private String agentUrl;

    private String agentSettingsUrl;

    private String sysInfoUrl;

    private String sysIndexUrl;

    private String agentCreateUrl;

    private String cmdDownloadLogUrl;

    public PlatformURL(String baseURL) {
        queueUrl = String.format("%s%s", baseURL, "cmd/queue/send");

        cmdUrl = String.format("%s%s", baseURL, "cmd/send");
        cmdDownloadLogUrl = String.format("%s%s", baseURL, "cmd/log/download");

        sysIndexUrl = String.format("%s%s", baseURL, "index");
        sysInfoUrl = String.format("%s%s", baseURL, "sys/info");

        agentUrl = String.format("%s%s", baseURL, "agents/list");
        agentCreateUrl = String.format("%s%s", baseURL, "agents/create");
        agentSettingsUrl = String.format("%s%s", baseURL, "agents/settings");
    }

    public String getAgentCreateUrl() {
        return agentCreateUrl;
    }

    public String getAgentSettingsUrl() {
        return agentSettingsUrl;
    }

    public String getCmdUrl() {
        return cmdUrl;
    }

    public String getQueueUrl() {
        return queueUrl;
    }

    public String getCmdDownloadLogUrl() {
        return cmdDownloadLogUrl;
    }

    public String getAgentUrl() {
        return agentUrl;
    }

    public String getSysIndexUrl() {
        return sysIndexUrl;
    }

    public String getSysInfoUrl() {
        return sysInfoUrl;
    }

    @Override
    public String toString() {
        return "PlatformURL{" +
            "cmdUrl='" + cmdUrl + '\'' +
            ", queueUrl='" + queueUrl + '\'' +
            ", agentUrl='" + agentUrl + '\'' +
            ", agentSettingsUrl='" + agentSettingsUrl + '\'' +
            ", sysInfoUrl='" + sysInfoUrl + '\'' +
            ", sysIndexUrl='" + sysIndexUrl + '\'' +
            ", agentCreateUrl='" + agentCreateUrl + '\'' +
            ", cmdDownloadLogUrl='" + cmdDownloadLogUrl + '\'' +
            '}';
    }
}