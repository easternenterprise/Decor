package com.github.easternenterprise.githubtheme.services

import com.github.easternenterprise.githubtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
