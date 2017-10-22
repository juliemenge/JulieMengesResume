package com.juliemenge.juliemengesresume

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import net.expandable.ExpandableTextView
import net.expandable.OnExpandableClickListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        workExperienceExpandableText.text = "-->"
        educationExpandableText.text = "-->"
        communityInvolvementExpandableText.text = "-->"
        sitesExpandableText.text = "-->"

        workExperienceExpandableText.setOnExpandableClickListener(object : OnExpandableClickListener {
            override fun expand(view: ExpandableTextView) {
                // Expand action
                workExperienceExpandableText.text = getString(R.string.work_experience)
            }

            override fun collapse(view: ExpandableTextView) {
                workExperienceExpandableText.text = "-->"
            }
        })

        educationExpandableText.setOnExpandableClickListener(object : OnExpandableClickListener {
            override fun expand(view: ExpandableTextView) {
                // Expand action
                educationExpandableText.text = getString(R.string.education)
            }

            override fun collapse(view: ExpandableTextView) {
                educationExpandableText.text = "-->"
            }
        })

        communityInvolvementExpandableText.setOnExpandableClickListener(object : OnExpandableClickListener {
            override fun expand(view: ExpandableTextView) {
                // Expand action
                communityInvolvementExpandableText.text = getString(R.string.community_involvement)
            }

            override fun collapse(view: ExpandableTextView) {
                communityInvolvementExpandableText.text = "-->"
            }
        })

        sitesExpandableText.setOnExpandableClickListener(object : OnExpandableClickListener {
            override fun expand(view: ExpandableTextView) {
                // Expand action
                sitesExpandableText.text = getString(R.string.sites)
            }

            override fun collapse(view: ExpandableTextView) {
                sitesExpandableText.text = "-->"
            }
        })
    }
}
