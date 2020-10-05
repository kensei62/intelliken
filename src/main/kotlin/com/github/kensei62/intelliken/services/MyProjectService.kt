package com.github.kensei62.intelliken.services

import com.intellij.openapi.project.Project
import com.github.kensei62.intelliken.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
