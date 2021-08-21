package com.github.easternenterprise.jetbrainstheme.services

import com.github.easternenterprise.jetbrainstheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
