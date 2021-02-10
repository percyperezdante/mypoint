pipelineJob('exampleWS') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/g1/Jenkinsfile'))
            sandbox()
        }
    }
}
