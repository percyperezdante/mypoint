libraryConfiguration {
        // An identifier you pick for this library, to be used in the @Library annotation.
        name('mylib')
    }
// execute echo command
job('example-1') {
    steps {
        shell('echo Hello World!')
    }
}
