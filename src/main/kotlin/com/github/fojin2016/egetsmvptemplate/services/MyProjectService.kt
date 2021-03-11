package com.github.fojin2016.egetsmvptemplate.services

import com.github.fojin2016.egetsmvptemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
