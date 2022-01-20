def clone(String branch_name,String Url) {
  echo "$branch_name"
  echo "$Url"
  git branch: '$branch_name', url: '$Url'
}
//git branch: 'ninja', url: 'https://github.com/ayushjakhmola001/spring3hibernate.git'
