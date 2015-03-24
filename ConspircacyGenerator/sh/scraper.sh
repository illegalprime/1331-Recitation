#!/bin/bash

URL=$1
URL_PATH=$( echo $URL | grep -o '/wiki.*$' )

LINKS=$( curl -s $URL | grep -Eo '/wiki/.+' | sed "s/[\"\'].*//g" )
FILTER=$( echo "$LINKS" | grep -v "$URL_PATH" | sort -u )

echo "$FILTER" | awk '{ print "http://en.wikipedia.org" $1 }'

