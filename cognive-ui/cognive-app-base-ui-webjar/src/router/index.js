import Vue from 'vue'
import Router from 'vue-router'
import BaseLayout from '@/components/layout/BaseLayout'
import Error403 from '@/components/errors/Error403'
import ContentTest from '@/components/layout/content/ContentTest'
import ContentSearch from '@/components/layout/content/search/ContentSearch'
import SearchIndividual from '@/components/layout/content/search/SearchIndividual'
import ApplicationForIndividual from '@/components/layout/content/search/ApplicationForIndividual'

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: '/proto/', // For Cognive project. Context path
  routes: [
    {
      path: '/',
      component: BaseLayout,
      children: [
        {
          path: '',
          name: 'Home',
          component: ContentTest
        },
        {
          path: 'search',
          name: 'Search',
          component: ContentSearch
        },
        {
          path: 'application',
          name: 'Application',
          component: ApplicationForIndividual
        },
        {
          path: 'application/:id',
          name: 'ApplicationWithId',
          component: ApplicationForIndividual,
          props: true
        }
      ]
    },
    {
      path: '/error/403',
      name: 'Error403',
      component: Error403
    },
    {
      path: '*',
      redirect: {name: 'Home'}
    }
  ]
})
