package cn.nzcer.findgithubdeveloper.service;

import cn.nzcer.findgithubdeveloper.bo.QueryConditionBO;
import cn.nzcer.findgithubdeveloper.entity.GitHubUser;

import java.util.List;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: GitHubUserService
 * @author: nzcer
 * @creat: 2023/12/2 16:21
 * @description:
 */
public interface GitHubUserService {
    List<GitHubUser> queryByCondition(QueryConditionBO queryBo);
}
