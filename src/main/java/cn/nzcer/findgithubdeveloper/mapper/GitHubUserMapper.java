package cn.nzcer.findgithubdeveloper.mapper;

import cn.nzcer.findgithubdeveloper.bo.QueryConditionBO;
import cn.nzcer.findgithubdeveloper.entity.GitHubUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: GitHubUserMapper
 * @author: nzcer
 * @creat: 2023/12/2 16:07
 * @description:
 */
@Mapper
public interface GitHubUserMapper {
    List<GitHubUser> selectByLogin(String login);

    List<GitHubUser> queryByCondition(QueryConditionBO queryBo);

}
