package com.aws.soccer.common.model;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Builder
@Data
@Component
@AllArgsConstructor
public class PageDTO {

    private Long pageSize;
    public static Long BLOCK_SIZE = 10L;

    private Long totalCount;
    private Long blockCount;
    private Long pageCount;

    private Long startRow;
    private Long endRow;

    private Long startPage;
    private Long endPage;

    private Long nextBlock;
    private Long prevBlock;

    private Long blockNum;
    private Long pageNum;

    boolean existPrev = false;
    boolean existNext = false;

}