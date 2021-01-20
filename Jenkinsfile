String VARS1="my variables"

pipeline {
    agent{
        label "andev10expge204.dca.diginsite.net-0df2134e"
    }
    stages{
        stage("one"){
            steps{
                script{
                    println("... ${VARS1}")
                    println("...dddddd  ${BRANCH_NAME}")
                    println("...dddddd  ${env.GLOBAL_PIPELINE_INITIALIZED}")

                }
            }
            
        }
        
    }
    
}
