def call(java.lang.String branch_name, java.net.URL Url) {
  echo "$branch_name"
  echo "$Url"
  git branch: '$branch_name', url: '$Url'
}
//git branch: 'ninja', url: 'https://github.com/ayushjakhmola001/spring3hibernate.git'
