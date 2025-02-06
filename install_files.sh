#mvn install:install-file \
#   -Dfile=emc-metalnx-services-4.3.3.0-RELEASE.jar \
#   -DgroupId=org.irods.jargon \
#   -DartifactId=emc-metalnx-services \
#   -Dversion=4.3.3.0-RELEASE \
#   -Dpackaging=jar \
#   -DgeneratePom=true
#
#set -x
#sudo cp -r /home/jjames/.m2/repository/org/irods/jargon/emc-metalnx-services/4.3.3.0-RELEASE /home/jjames/github/metalnx-web/local_maven_repo/repository/org/irods/jargon/emc-metalnx-services 
#set +x 

file=`ls /home/jjames/github/jargon/jargon-mdquery/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-mdquery \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-ticket/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-ticket \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-zipservice/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-zipservice \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-data-utils/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-data-utils \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-ruleservice/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-ruleservice \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/data-profile/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=data-profile \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-pool/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-pool \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-user-tagging/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-user-tagging \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

file=`ls /home/jjames/github/jargon/jargon-core/target/*4.3.6.0-RELEASE.jar`
echo $file
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file  \
    -Dfile=$file \
    -DgroupId=org.irods.jargon -DartifactId=jargon-core \
    -Dversion=4.3.6.0-RELEASE -Dpackaging=jar \
    -DlocalRepositoryPath=/home/jjames/.m2/repository

#./jargon-mdquery/target/jargon-mdquery-4.3.6.0-RELEASE.jar
#./jargon-ticket/target/jargon-ticket-4.3.6.0-RELEASE.jar
#./jargon-zipservice/target/jargon-zipservice-4.3.6.0-RELEASE.jar
#./jargon-data-utils/target/jargon-data-utils-4.3.6.0-RELEASE.jar
#./jargon-ruleservice/target/jargon-ruleservice-4.3.6.0-RELEASE.jar
#./data-profile/target/data-profile-4.3.6.0-RELEASE.jar
#./jargon-pool/target/jargon-pool-4.3.6.0-RELEASE.jar
#./jargon-user-tagging/target/jargon-user-tagging-4.3.6.0-RELEASE.jar
#./jargon-core/target/jargon-core-4.3.6.0-RELEASE-jar-with-dependencies.jar
#./jargon-core/target/jargon-core-4.3.6.0-RELEASE.jar
