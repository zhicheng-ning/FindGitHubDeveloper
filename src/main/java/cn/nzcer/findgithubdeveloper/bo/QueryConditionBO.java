package cn.nzcer.findgithubdeveloper.bo;

import cn.nzcer.findgithubdeveloper.enums.BlogStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: QueryConditionBO
 * @author: nzcer
 * @creat: 2023/12/2 16:42
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryConditionBO {
    private String         name;
    private String         company;
    private BlogStatusEnum blogStatus = BlogStatusEnum.NOT_CARE;
    private String         location;
    private Integer        minRepos;
    private Integer        maxRepos;
    private Integer        minFollowers;
    private Integer        maxFollowers;
    private Integer        minFollowings;
    private Integer        maxFollowings;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date           minCreatedAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date           maxCreatedAt;
}
