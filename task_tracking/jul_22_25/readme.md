## About Excel Sheet

1. how to duplicate the sheet
2. how to fill sheet
3. others (for sheet)

## Basic Linux and Git Commands

### Linux Commands

```bash
ls # list dir
ls -a
ls -la
cd # change directroy
rm -r  # remove/delete files or directories, -r recursively
rm -rf * # delete all
rmdir # remove directory
touch # create a file
cat # see content of a files
```

## git commands

```bash
git init
git add
git commit
git config --global user.name
git config --global user.email
git push
git log
git diff
```

## Leetcode Question Solving (1051)

1. Sorting Algo
2. Min, Max
3. Dry running the solution
   - How to find Min, Max

### Explained this code

```java
 public static void main(String[] args) {

    int arr[]={1,4,20,7,2,6,10,15,20,11,17,16};

    int max1= Integer.MIN_VALUE;
    int max2= Integer.MIN_VALUE;

    for (int i=0;i<arr.length;i++)
    {
        if(arr[i]>max1)
        {
            //
            max2 = max1;
            max1=arr[i];
        } else if (arr[i] > max2 && arr[i]!=max1)
        {
            // found new second largest that is not equal to the larget
            max2 = arr[i];
        }
    }
    System.out.println(max1);
    System.out.println(max2);
}
```

## TODO for next class

> HomeWork: decentralized and centralized system real time applications

### Two types

1. Critical personal information
2. Normal personal information

3. Consent based cookies - IP , name, Age
   Personal data processing
   Consent - Data privacy included
   Data hidden in browser

4. Personal data processing

> concent data hidden in the browser

5. Can we solve `Q1051` without Array.sort() ??
