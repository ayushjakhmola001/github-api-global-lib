def clone(String branch_name,String Url) {
  echo "$branch_name"
  echo "$Url"
  git branch: 'ninja', credentialsId: 'c3a2c9c1-bce8-4fb5-9a0a-2830274c46e6', url: 'https://github.com/ayushjakhmola001/spring3hibernate.git'
  
}
def test (){
sh 'mvn clean compile'
sh 'mvn pmd:pmd'
sh 'mvn checkstyle:checkstyle'
sh 'mvn cobertura:cobertura'
}
def report(){
recordIssues(tools: [pmdParser()])
recordIssues(tools: [checkStyle()])

}
def clean(){
sh 'mvn clean'
}
