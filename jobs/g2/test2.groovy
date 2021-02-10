// execute echo command
folder('project1'){
    displayName('project one')
}
job('project1/example-2') {
    steps {
        shell('good bye Hello World!')
    }
}
