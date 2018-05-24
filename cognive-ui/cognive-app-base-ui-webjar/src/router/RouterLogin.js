import Vue from 'vue'
import Router from 'vue-router'
import LoginPage from '@/components/login/LoginPage'
import RecoveryPage from '@/components/login/RecoveryPage'

Vue.use(Router);

export default new Router({
  mode: 'history',
  base: '/proto/', // For Cognive project. Context path
  routes: [
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
      path: '*',
      redirect: {name: 'Login'}
    }
  ]
})
