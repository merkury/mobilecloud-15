package org.magnum.mobilecloud.video.controller

import com.google.common.base.Objects

/**
 * A simple object to represent a video and its URL for viewing.
 *
 * @author jules
 */
class Video {

    var name: String? = null
    var url: String? = null
    var duration: Long = 0

    constructor() {}

    constructor(name: String, url: String, duration: Long) {
        this.name = name
        this.url = url
        this.duration = duration
    }

    /**
     * Two Videos will generate the same hashcode if they have exactly
     * the same values for their name, url, and duration.
     *
     */
    override fun hashCode(): Int {
        // Google Guava provides great utilities for hashing
        return Objects.hashCode(name, url, duration)
    }

    /**
     * Two Videos are considered equal if they have exactly
     * the same values for their name, url, and duration.
     *
     */
    override fun equals(obj: Any?): Boolean {
        if (obj is Video) {
            val other = obj as Video?
            // Google Guava provides great utilities for equals too!
            return (Objects.equal(name, other!!.name)
                    && Objects.equal(url, other.url)
                    && duration == other.duration)
        } else {
            return false
        }
    }

}
