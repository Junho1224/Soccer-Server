package com.aws.soccer.common.service;

import com.aws.soccer.common.model.PageDTO;

public interface PageService {
    PageDTO getPageDTO(Long totalCount, Long pageSize, Long pageNum);
}
