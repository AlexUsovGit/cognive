import Vue from 'vue'
import Router from 'vue-router'
import LoginPage from '@/components/login/LoginPage'
import BaseLayout from '@/components/layout/BaseLayout'
import Error403 from '@/components/errors/Error403'
import RecoveryPage from '@/components/login/RecoveryPage'
import ContentTest from '@/components/layout/content/ContentTest'
import ContentSearch from '@/components/layout/content/search/ContentSearch'

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: '/proto/', // Context path for Cognive project
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
        }
      ]
    },
    {
      path: '/login',
      name: 'Login',
      component: LoginPage
    },
    {
      path: '/recovery',
      name: 'Recovery',
      component: RecoveryPage
    },
    {
      path: '/recovery/:token',
      name: 'RecoveryWithToken',
      component: RecoveryPage,
      props: true
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
