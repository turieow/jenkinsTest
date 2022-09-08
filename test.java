# yum -y install git java-1.8.0-openjdk-devel
# cd /var/lib && mkdir -p git/testrepo
# cd git/testrepo
# git init --bare --shared
Initialized empty shared Git repository in /var/lib/git/testrepo
# cd
# git config --global user.name root
# git config --global user.email "root@localhost"
# mkdir hello && cd hello/
# git init
Initialized empty Git repository in /root/hello/.git/
# cat > Hello.java
public class Hello {
public static void main(String args[]) {
System.out.println("Hello");
}
}
^D
# git add Hello.java
# git commit -m "sample code"
[master (root-commit) 48c2284] sample code
1 file changed, 5 insertions(+)
create mode 100644 Hello.java
# git remote add origin /var/lib/git/testrepo
# git push origin master
Counting objects: 3, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 292 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To /var/lib/git/testrepo
* [new branch] master -> master