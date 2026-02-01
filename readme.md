Build:
mvn --batch-mode --update-snapshots

Tests:
mvn --batch-mode --update-snapshots


Get gh private token:
On Github settings, go to Developer settings / Personal Access Tokens / Create classic PAT with
packages:write scope and copy the token.

Set the local mvn
Set /.m2/settings.xml to look like:
```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

    <servers>
        <server>
            <id>github</id>
            <username>{GITHUB_USERNAME}</username>
            <password>{GITHUB_TOKEN}</password>
        </server>
    </servers>
</settings>
```

Then change the url of package repo in pom.xml:
```
        <distributionManagement>
        <repository>
            <id>github</id>
            <name>GitHub Packages</name>
            <url>https://maven.pkg.github.com/{GITHUB_ACCOUNT}/prime-generator</url>
        </repository>
    </distributionManagement>
```

Deploy:
% mvn --batch-mode deploy