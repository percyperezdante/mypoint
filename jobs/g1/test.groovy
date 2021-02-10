@Library('mylib') _
job('example-1') {
    steps {
        shell('echo Hello World!')
    }
}
