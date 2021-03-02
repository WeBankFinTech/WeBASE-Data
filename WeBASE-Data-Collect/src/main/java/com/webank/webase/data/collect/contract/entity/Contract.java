/**
 * Copyright 2014-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.webank.webase.data.collect.contract.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 *
 */
@Data
public class Contract {
    @NotNull
    @Min(1)
    @Max(9999)
    private Integer chainId;
    @NotNull
    private Integer groupId;
    private Integer contractId;
    @NotBlank
    @Length(min=1, max=120)
    private String contractName;
    @NotBlank
    private String contractPath;
    private String contractSource;
    private String contractAbi;
    private String runtimeBin;
    private String bytecodeBin;
}
