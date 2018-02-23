#!/usr/bin/env bash

# build admin-ui
cd ../chronos-ui/
npm run build

# copy into tx-admin
cp ./dist/index.html ../chronos-web/src/main/resources/templates/
cp -r ./dist/* ../chronos-web/src/main/resources/static/
rm ../chronos-web/src/main/resources/static/index.html
