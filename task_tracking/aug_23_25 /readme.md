# Git

## Basic commands

```bash
git init # repository
git status # check status of files
# if files are red, it means files are not staged, use git add to add files to staging area
git add . # . is for current working directory all files.
# if files are green, it means files are in stages, but not taken the snapshot, we need to commint
git commint -m "Message like added print file"
```

### Branch, default (main)

```bash
git branch # see all branches
git checkout -b manisha-test # create new branch name, manisha-test
git checkout main # switch HEAD to main
git diff # see differences b/w changes
git log # see all commits with hash id's
```

### Little bit about vim

- vim
- lazyvim
- it is a wrapper
- code editor

### github

```bash
git remote add origin <URL>
```

- git merging
