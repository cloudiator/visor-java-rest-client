#!/bin/sh

java -jar bin/swagger-codegen-cli.jar generate -i ../visor/swagger/swagger.yaml -l java --artifact-id java-rest --group-id io.github.cloudiator.visor.client --artifact-version 0.3.0-SNAPSHOT --api-package io.github.cloudiator.visor.rest.api --model-package io.github.cloudiator.visor.rest.model --additional-properties serializableModel=true -DhideGenerationTimestamp=true
