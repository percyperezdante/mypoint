folder('project2'){
    displayName('project two')
}
pipelineJob('project2/exampleWS') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/g1/Jenkinsfile'))
            sandbox()
        }
    }
}
