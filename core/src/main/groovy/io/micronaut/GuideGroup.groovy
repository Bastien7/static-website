package io.micronaut

import groovy.transform.CompileStatic

@CompileStatic
class GuideGroup implements GuideGroupHtml {
    String title
    String image
    String description
    String ulId
    List<GuideGroupItem> items = []
}
