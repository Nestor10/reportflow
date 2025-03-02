#!/usr/bin/env bash
set -e
# Import the project environment variables
. ./scripts/env.sh

# This is a hack to force the build-env.sh file to be generated
# And setup the project
if [ ! -e $BUILD_ENV_FILE ]; then
    sbt projects
fi
. ./scripts/setup-noninteractive.sh
echo ${BUILD_CLEAN}32132132132132132132132121321

MOD=$MOD sbt "${BUILD_CLEAN}server/Docker/publishLocal"
