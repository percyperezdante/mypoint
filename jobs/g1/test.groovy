// execute echo command
job('example-1') {
    libraryConfiguration {
        // An identifier you pick for this library, to be used in the @Library annotation.
        name('mylib')
    }
    steps {
        shell('echo Hello World!')
    }
}
