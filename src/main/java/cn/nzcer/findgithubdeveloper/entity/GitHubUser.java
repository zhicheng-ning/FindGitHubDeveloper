package cn.nzcer.findgithubdeveloper.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: GitHubUser
 * @author: nzcer
 * @creat: 2023/12/2 15:56
 * @description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GitHubUser {
    private Integer id;
    private String login;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String bio;
    private Integer publicRepos;
    private Integer followers;
    private Integer following;
    private Date createdAt;
    private Date updatedAt;
    private Date recordTime;
}
