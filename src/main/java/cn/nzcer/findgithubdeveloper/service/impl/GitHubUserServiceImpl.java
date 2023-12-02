package cn.nzcer.findgithubdeveloper.service.impl;

import cn.nzcer.findgithubdeveloper.bo.QueryConditionBO;
import cn.nzcer.findgithubdeveloper.entity.GitHubUser;
import cn.nzcer.findgithubdeveloper.mapper.GitHubUserMapper;
import cn.nzcer.findgithubdeveloper.service.GitHubUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: GitHubUserServiceImpl
 * @author: nzcer
 * @creat: 2023/12/2 16:22
 * @description:
 */
@Service
public class GitHubUserServiceImpl implements GitHubUserService {
    @Autowired
    private GitHubUserMapper gitHubUserMapper;

    @Override
    public List<GitHubUser> queryByCondition(QueryConditionBO queryBo) {
        if (queryBo != null) {
            return gitHubUserMapper.queryByCondition(queryBo);
        }
        return null;
    }
}
