package cn.nzcer.findgithubdeveloper.controller;

import cn.nzcer.findgithubdeveloper.bo.QueryConditionBO;
import cn.nzcer.findgithubdeveloper.entity.GitHubUser;
import cn.nzcer.findgithubdeveloper.service.GitHubUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @project: FindGitHubDeveloper
 * @ClassName: MainController
 * @author: nzcer
 * @creat: 2023/12/2 15:25
 * @description:
 */
@Controller
public class MainController {
    @Autowired
    private GitHubUserService gitHubUserService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/search")
    public ModelAndView search(QueryConditionBO bo,
                               @RequestParam(defaultValue = "1") int pageNum,
                               @RequestParam(defaultValue = "20") int pageSize) {
        //System.out.println(bo);
        PageHelper.startPage(pageNum, pageSize);
        List<GitHubUser> gitHubUsers = gitHubUserService.queryByCondition(bo);
        PageInfo<GitHubUser> pageInfo = new PageInfo<>(gitHubUsers,pageSize);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("searchResults", gitHubUsers);
        modelAndView.addObject("pageInfo", pageInfo);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
