import org.springframework.aop.scope.ScopedProxyFactoryBean

// Place your Spring DSL code here
beans = {

    sessionComponent(ScopedProxyFactoryBean) {
        targetBeanName = 'sessionComponentService'
        proxyTargetClass = true
    }
}
