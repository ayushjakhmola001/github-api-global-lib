def clone(String branch_name,URL Url ) {
  echo "$branch_name"
  echo "$Url"
  git branch: '$branch_name', url: '$Url'
}
