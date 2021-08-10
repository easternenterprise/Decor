package com.github.eebhushan.githubtheme.services

import com.github.eebhushan.githubtheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
