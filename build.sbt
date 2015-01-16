//   Copyright 2014 Commonwealth Bank of Australia
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

uniform.project("herringbone", "au.com.cba.omnia.herringbone")

uniformDependencySettings

uniformAssemblySettings

uniform.ghsettings

libraryDependencies ++= Seq(
  "com.twitter"       % "parquet-common"   % "1.2.5-cdh4.6.0-p485" % "provided",
  "com.twitter"       % "parquet-encoding" % "1.2.5-cdh4.6.0-p485" % "provided",
  "com.twitter"       % "parquet-column"   % "1.2.5-cdh4.6.0-p485" % "provided",
  "com.twitter"       % "parquet-hadoop"   % "1.2.5-cdh4.6.0-p485" % "provided",
  "org.apache.hadoop" % "hadoop-client"    % "2.0.0-mr1-cdh4.6.0"  % "provided",
  "org.apache.hadoop" % "hadoop-core"      % "2.0.0-mr1-cdh4.6.0"  % "provided",
  "org.rogach"       %% "scallop"          % "0.9.5"
)