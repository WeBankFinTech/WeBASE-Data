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
package com.webank.webase.data.fetcher.audit;

import com.webank.webase.data.fetcher.audit.entity.TbAuditInfo;
import com.webank.webase.data.fetcher.base.entity.BaseQueryParam;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditMapper {

    int add(TbAuditInfo tbAuditInfo);
    
    int confirm(@Param("id") Integer id);

    Integer getCount();

    List<TbAuditInfo> getList(BaseQueryParam param);

    TbAuditInfo getAuditInfoById(@Param("id") Integer id);
    
    TbAuditInfo getAuditInfoByTxHash(@Param("txHash") String txHash);

    int remove(@Param("id") Integer id);
}
