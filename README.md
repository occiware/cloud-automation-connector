# Cloud-Automation Connector

## Introduction

The purpose of the software is to support OCCI request in order to manage infrastructure through [Cloud Automation](https://www.activeeon.com/cloud-automation). Cloud automation connector is an [OCCI infrastructure](https://www.ogf.org/documents/GFD.184.pdf) implementation. The code was generated thanks to the [OCCIware studio](https://github.com/occiware/OCCI-Studio).

## Build and run

To build the software you need to have maven installed. Then run the following command :

```maven
mvn clean install
```

The software was designed to run as a plugin inside [Mart-Server](https://github.com/occiware/MartServer).

To use the plugins indside Mart Server follow the steps below :
1. Put .jar file from org.occiware.cloudautomation.connector/target/ in the martserver-plugins directory in MartServer home (if the directory doesn't exist, create it).
2. In the pom from MartServer/org.occiware.mart.server, the following tags must be added in the "dependencies" section :

```xml
<dependency>
    <groupId>org.occiware</groupId>
    <artifactId>org.occiware.cloudautomation.connector</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <scope>runtime</scope>
</dependency>
```

3. Then follow the [MartServer administration guide](https://github.com/occiware/MartServer/blob/master/doc/server.md) to run MartServer.

## License

Copyright (c) 2015-2017 Obeo, Inria, Activeeon

All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

 Contributors:
 - William Piers <william.piers@obeo.fr>
 - Philippe Merle <philippe.merle@inria.fr>
 - Faiez Zalila <faiez.zalila@inria.fr>
 - Christophe Gourdin <christophe.gourdin@inria.fr>
 - Mael Audren de kerdrel <mael.audren@activeeon.com>

       