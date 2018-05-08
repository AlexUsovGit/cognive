import Vue from 'vue'
import LoginPage from '@/components/login/LoginPage'

describe('LoginPage.vue', () => {
  it('should render correct contents', () => {
    const Constructor = Vue.extend(LoginPage)
    const vm = new Constructor().$mount()
    expect('Welcome to Your Vue.js App')
      .to.equal('Welcome to Your Vue.js App')
  })
})
